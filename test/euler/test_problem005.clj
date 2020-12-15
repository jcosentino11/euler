(ns euler.test-problem005
  (:require [clojure.test :refer :all]
            [euler.problem005 :as p5]))

(deftest problem5
  (testing "problem 5"
    (testing "solution"
      (is (= (p5/solution) 232792560)))
    (testing "lcm"
      (is (= (p5/lcm [21 6]) 42))
      (is (= (p5/lcm 21 6) 42)))
    (testing "gcd"
      (is (= (p5/gcd [270 192]) 6))
      (is (= (p5/gcd 270 192) 6)))
    (testing "example case"
      (is (= (time (p5/smallest-multiple 10)) 2520)))))
