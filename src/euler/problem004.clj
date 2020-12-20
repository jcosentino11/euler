(ns euler.problem004
  (:gen-class)
  (:import (java.lang.Math))
  (:require [clojure.string :as str]))

(defn is-palindrome
  "True if the provided number is a palindrome"
  ([n] (= (str n) (str/reverse (str n)))))

;; Naive approach
(defn largest-palindrome-product
  "Find the largest palindrome product for two n-digit numbers"
  ([n]
   (apply max
          (let [upper-bound (- (int (java.lang.Math/pow 10 n)) 1)]
            (for [i (range upper-bound 1 -1)
                  j (range upper-bound 1 -1)
                  :let [p (* i j)]
                  :when (is-palindrome p)]
              p)))))

(def solution #(largest-palindrome-product 3))
