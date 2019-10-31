(ns introduction.exercise12)
;https://www.hackerrank.com/challenges/eval-ex/problem

(defn sum-of-multiples [num]
  (let [total-sum (atom 0)]
    (doseq [i (range (inc 9))]
      (swap! total-sum
             (fn [x]
               (+ x (double
                      (/ (reduce * (repeat i num)) (reduce * (range 1 (inc i))))))))
      ;test print
      (println "Número:" num)
      (println "Indice:" i)
      (println "Potência:" (double (reduce * (repeat i num))))
      (println "Fatorial:" (double (reduce * (range 1 (inc i)))))
      (println "Divisão:" (double (/ (reduce * (repeat i num)) (reduce * (range 1 (inc i))))))
      (println "Soma:" (with-precision 4 @total-sum))
      (println "----------")
      )
    (format "%.4f" @total-sum)))

;test
(println (sum-of-multiples 20))
(println (sum-of-multiples 5))