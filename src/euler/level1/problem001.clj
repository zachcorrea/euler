(ns euler.level1.problem001)

(defn multiple-of-3-or-5? [n]
  (and 
	(not= n 0)
    (or
		(= 0 (mod n 3))
  		(= 0 (mod n 5))
  )))
  
(defn multiples-up-to [n]
	(filter multiple-of-3-or-5? (range n))

	)
  
(defn euler-1 [n]
  (apply + (multiples-up-to n)))
  