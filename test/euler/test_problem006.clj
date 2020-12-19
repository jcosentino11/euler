(ns euler.test-problem006
  (:require [clojure.test :refer :all]
            [euler.problem006 :as p6]))

(deftest problem6
  (testing "problem 6"
    (testing "solution"
      (is (= (p6/solution) 25164150)))
    (testing "square"
      (is (= (p6/square 2) 4))
      (is (= (p6/square 3) 9)))
    (testing "example case"
      (is (= (time (p6/sum-square-diff 10)) 2640)))))
