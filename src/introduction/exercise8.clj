(ns introduction.exercise8)
;https://www.hackerrank.com/challenges/fp-reverse-a-list/problem

;test list
(def lst [5 4 3 2 1 0])

;understanding
(println (reduce conj () [2 1 0]))
(println (reduce conj [5 4 3] [2 1 0]))
(println (reduce conj () lst))
(println (conj () lst))

;final
(fn [lst] (reduce conj () lst))
