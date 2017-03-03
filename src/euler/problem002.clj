(ns euler.problem002
	(:gen-class))

(defn fib-seq
	"Return a lazy fibonacci sequence"
	([] (fib-seq 1 1))
	([a b] (lazy-seq (cons a (fib-seq b (+ a b))))))

(defn even-fib-sum 
	[max]
	"Return the sum of all even numbers, not exceeding max, 
	within the Fibonacci sequence"
	(reduce + (filter even? (take-while #(<= % max) (fib-seq)))))

(def solution (even-fib-sum 4000000))