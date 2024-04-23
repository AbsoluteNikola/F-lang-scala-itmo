(prog 
    ((a 3) (b 4) (c 5)) 
    ((func is_rightangled (a b c) 
    (cond (less a 1)
		(false)
		(cond (less b 1)
			(false)
			(cond (less c 1)
				(false)
				(equal 
					(plus (plus (sqr a) (sqr b)) (sqr c)) 
					(sqr (get_max (get_max a b) c)))))))
	(print (is_rightangled a b c))))
(is_rightangled 2 3 10) ; outside the scope of the function declaration