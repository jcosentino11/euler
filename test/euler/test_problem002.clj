(ns euler.test-problem002
  (:require [clojure.test :refer :all]
            [euler.problem002 :as p2]))

(deftest problem2
  (testing "problem 2"
    (testing "solution"
      (is (= (p2/solution) 4613732)))
    (testing "other cases"
      (is (= (p2/even-fib-sum 0) 0))
      (is (= (p2/even-fib-sum 1) 0))
      (is (= (p2/even-fib-sum 2) 2))
      (is (= (p2/even-fib-sum 3) 2))
      (is (= (p2/even-fib-sum 4) 2))
      (is (= (p2/even-fib-sum 5) 2))
      (is (= (p2/even-fib-sum 6) 2))
      (is (= (p2/even-fib-sum 7) 2))
      (is (= (p2/even-fib-sum 8) 10))
      (is (= (p2/even-fib-sum 9) 10)))))