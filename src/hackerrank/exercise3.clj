(ns hackerrank.exercise3)
;https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

(defn hello_word_n_times [n] ((dotimes  [_ n] (println "Hello World"))))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)