(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "multiple of 3 or 5?"
    (should= false (multiple-of-3-or-5? 0))
	(should= false (multiple-of-3-or-5? 1))
	(should= true (multiple-of-3-or-5? 3))
	(should= true (multiple-of-3-or-5? 5))
	(should= true (multiple-of-3-or-5? 6)))

  (it "multiples-up-to n"
    (should= [] (multiples-up-to 0))
	(should= [3] (multiples-up-to 4))
	(should= [3 5 6 9] (multiples-up-to 10))
  )
	
	
  (it "Solves #1"
    (should= 23 (euler-1 10))
	(should= -1 (euler-1 1000)))
  )

(run-specs)
