(ns euler.test-problem001
	(:require [clojure.test :refer :all]
		[euler.problem001 :as p1]))

(deftest problem1
	(testing "problem 1"
		(testing "solution"
			(is (= (p1/solution) 233168)))
		(testing "other cases"
			(is (= (p1/multiples3and5 0) 0))
			(is (= (p1/multiples3and5 1) 0))
			(is (= (p1/multiples3and5 4) 3))
			(is (= (p1/multiples3and5 6) 8))
			(is (= (p1/multiples3and5 16) 60))))) 