(ns euler.problem006
  (:gen-class))

;; naive approach, perform calculation on range

(defn square
  "Calcuate n^2"
  [n] (reduce * (repeat 2 n)))

(defn sum-square-diff-naive
  "Calculate the difference betwen sum of squares 1 through n
  and sum of 1 through n squared"
  [n]
  (let [sum-squares (reduce + (map square (range 1 (inc n))))
        sum-squared (square (reduce + (range 1 (inc n))))]
    (- sum-squared sum-squares)))

;; fast approach, using formulas

(defn sum-squares
  "Calculate sum of squares 1 through n
  
  (1^2 + 2^2 + 3^2 + ... + n^2) = n(n+1)(2n + 1) / 6
  resource: https://www.khanacademy.org/math/algebra-home/alg-series-and-induction#alg-sum-of-n-squares
  "
  [n]
  (/ (* n (inc n) (inc (* 2 n))) 6))

(defn sum-squared
  "Calculate sum of 1 through n squared
  
  (1 + 2 + 3 + ... + n)^2 = (n(n + 1) / 2)^2 =  n^2(n + 1)^2 / 4
  resource: https://en.wikipedia.org/wiki/1_%2B_2_%2B_3_%2B_4_%2B_%E2%8B%AF
  "
  [n]
  (/ (* (square n) (square (inc n))) 4))

(defn sum-square-diff
  "Calculate the difference betwen sum of squares 1 through n
  and sum of 1 through n squared"
  [n]
  (- (sum-squared n) (sum-squares n)))

(def solution #(sum-square-diff 100))
