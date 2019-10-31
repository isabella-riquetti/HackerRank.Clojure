(ns introduction.exercise9)
;https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem

;test lazy seq
(def lst (flatten [3 2 4 6 5 7 8 0 1]))

;final
(println (reduce + (filter odd? lst)))