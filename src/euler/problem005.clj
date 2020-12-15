(ns euler.problem005
  (:gen-class))

;; Brute-force approach

(defn divisible
  "True if i is divisible by n"
  ([i n]
   (zero? (mod i n))))

(defn divisible-by-all
  "True if i is divisible by all numbers 1 through n"
  ([i n]
   (every? #(divisible i %1) (range n 1 -1))))

(defn smallest-multiple-naive
  "Finds the smallest positive number that is evenly divisible by all numbers 1 through n.
   This uses a very slow, brute-force algo."
  ([n]
   (first (filter #(divisible-by-all %1 n) (drop n (range))))))

(def naive-solution #(smallest-multiple-naive 20))


;; Least Common Multiple, using euclidian algorithm
;;
;; helpful sources:
;;   https://en.wikipedia.org/wiki/Least_common_multiple
;;   https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm


(defn gcd
  "Returns the gcd of the given numbers or sequence"
  ([coll] (reduce gcd coll))
  ([a b]
   (cond
     (zero? a) b
     (zero? b) a
     :else (gcd b (mod a b)))))

(defn lcm
  "Returns the least common multiple of the given numbers or sequence"
  ([coll] (reduce lcm coll))
  ([a b] (* (/ a (gcd a b)) b)))

(defn smallest-multiple
  "Finds the smallest positive number that is evenly divisible by all numbers 1 through n"
  ([n] (lcm (range 1 (+ n 1)))))

(def solution #(smallest-multiple 20))
