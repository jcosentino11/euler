(ns euler.test-problem005
  (:require [clojure.test :refer :all]
            [euler.problem005 :as p5]))

(deftest problem5
  (testing "problem 5"
    ; (testing "solution"
    ;   (is (= (p5/solution) ????)))
    (testing "example case"
      (is (= (p5/smallest-multiple 10) 2520)))))