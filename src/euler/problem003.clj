(ns euler.problem003
  (:gen-class))

(defn largest-prime-factor
  "Find the largest prime factor for positve integers greater than one"
  ([n] (largest-prime-factor n 2))
  ([n div]
   (cond
     (= n div) n
     (> (* div div) n) n
     :else (if (zero? (mod n div))
             (largest-prime-factor (/ n div) div)
             (largest-prime-factor n (inc div))))))

(def solution #(largest-prime-factor 600851475143))