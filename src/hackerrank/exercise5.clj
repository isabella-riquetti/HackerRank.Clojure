(ns hackerrank.exercise5)
;https://www.hackerrank.com/challenges/fp-filter-array/problem

(fn [limit lst] (remove nil? (map #(if (< % limit) %) lst)))