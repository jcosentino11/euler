(ns euler.test-problem003
  (:require [clojure.test :refer :all]
            [euler.problem003 :as p3]))

(deftest problem3
  (testing "problem 3"
    (testing "solution"
      (is (= (p3/solution) 6857)))
    (testing "other cases"
      (is (= (p3/largest-prime-factor 2) 2))
      (is (= (p3/largest-prime-factor 3) 3))
      (is (= (p3/largest-prime-factor 4) 2))
      (is (= (p3/largest-prime-factor 5) 5))
      (is (= (p3/largest-prime-factor 6) 3))
      (is (= (p3/largest-prime-factor 349) 349))
      (is (= (p3/largest-prime-factor 456) 19))
      (is (= (p3/largest-prime-factor 12345) 823)))))