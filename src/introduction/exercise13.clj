(ns introduction.exercise13
  (:require [clojure.string :as str]))
;https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem

(def F (map #(Integer. %) (str/split (read-line) #" ")))
(def P (map #(Integer. %) (str/split (read-line) #" ")))
(def lim (map #(Integer. %) (str/split (read-line) #" ")))
(def lo (nth lim 0))
(def hi (+ 0.001M (nth lim 1)))

(defn sum-power-and-multiplication [x]
  (reduce + (map * F (map #(Math/pow x %) P))))

(defn calculate-area [r]
  (* (reduce + r) 0.001M))

(defn calculate-volume [r]
  (reduce + (map #(* (* Math/PI % %) 0.001M) r)))

(defn get-sums []
  (map #(sum-power-and-multiplication %) (range lo hi 0.001M)))

(let
  [r (get-sums)]
  (println (format "%.1f" (calculate-area r)))
  (println (format "%.1f" (calculate-volume r))))

;test-parameters
;(def F (flatten [1 2 3 4 5]))
;(def P (flatten [6 7 8 9 10]))
;(def lo 1)
;(def hi (+ 0.001M 4))

;understanding
  ;(->> )
    ;(def c 5)
    ;equivalents
      ;(println "+3 /2 -1:" (float (- 1 (/ 2 (+ 3 c)))))
      ;(println "+3 /2:" (float (->> c (+ 3) (/ 2) (- 1))))
  ;(map + [] [])
    ;(println (map + [1 2 3 10] [4 5 6]))
