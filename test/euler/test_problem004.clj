(ns euler.test-problem004
  (:require [clojure.test :refer :all]
            [euler.problem004 :as p4]))

(deftest problem4
  (testing "problem 4"
    (testing "solution"
      (is (= (p4/solution) 906609)))
    (testing "is-palindrome"
      (is (p4/is-palindrome 1))
      (is (p4/is-palindrome 101))
      (is (not (p4/is-palindrome 10))))
    (testing "example case"
      (is (= (p4/largest-palindrome-product 2) 9009)))))