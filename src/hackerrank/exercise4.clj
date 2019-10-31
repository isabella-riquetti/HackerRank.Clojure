(ns hackerrank.exercise4)
https://www.hackerrank.com/challenges/fp-list-replication/problem

(fn [n-times numbers]
  (flatten (map #(replicate n-times %) numbers)))