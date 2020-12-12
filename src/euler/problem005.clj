(ns euler.problem005
  (:gen-class))

(defn divisible
  "True if i is divisible by n"
  ([i n]
   (zero? (mod i n))))

(defn divisible-by-all
  "True if i is divisible by all numbers 1 through n"
  ([i n]
   (every? #(divisible i %1) (range 1 (+ n 1)))))

;; Naive approach
;; TODO speed it up
(defn smallest-multiple
  "Finds the smallest positive number that is evenly divisible by all numbers 1 through n"
  ([n]
   (first (filter #(divisible-by-all %1 n) (drop n (range))))))

(def solution #(smallest-multiple 20))
