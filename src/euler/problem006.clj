(ns euler.problem006
  (:gen-class))

(defn square
  "Calcuate n^2"
  [n] (reduce * (repeat 2 n)))

(defn sum-square-diff
  "Calculate the difference betwen sum of squares 1 through n
  and sum of 1 through n squared"
  [n]
  (let [sum-squares (reduce + (map square (range 1 (inc n))))
        sum-squared (square (reduce + (range 1 (inc n))))]
    (- sum-squared sum-squares)))

(def solution #(sum-square-diff 100))
