(ns hackerrank.exercise1)
;https://www.hackerrank.com/challenges/fp-solve-me-first/problem

(defn solveMeFirst [x y]
  (+ x y))

(println "Digite o primeiro número:")
(def a (read-line)
  println "Digite o primeiro número:")
(def b (read-line))

(println "Soma dos números:")
(println (solveMeFirst (Integer/parseInt a) (Integer/parseInt b)))

