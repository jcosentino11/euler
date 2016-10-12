(ns euler.problem001
  (:gen-class))

(defn multiples3and5
  [max]
  "Return the sum of all multiples of 3 and 5 within
  a given maximum (exclusive)"
  (reduce + (set (concat (range 0 max 3) (range 0 max 5)))))

(def solution (multiples3and5 1000))
