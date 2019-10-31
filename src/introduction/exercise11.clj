(ns introduction.exercise11)
;https://www.hackerrank.com/challenges/fp-update-list/problem

;test list
(def lst [0 -1 3 -5])

;final
(println
  (map
    #(Math/abs %) lst))