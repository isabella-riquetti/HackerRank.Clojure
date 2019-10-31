(ns introduction.exercise10)
;https://www.hackerrank.com/challenges/fp-list-length/problem

;test list
(def lst (flatten [10 9 8 7 6]))
(def lst2 (into [] lst))

;understanding
(println (fn [curr _] (inc curr)) 0 lst)

;final
(println (reduce (fn [lst-count _] (inc lst-count)) 0 lst))