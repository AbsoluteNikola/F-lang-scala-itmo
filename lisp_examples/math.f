(func sqr (x)
	(times x x))
	
(func sqrt_by_taylor (x)
	((setq dec_x (minus x 1))
	(setq sqrt_iter 
		(lambda (prev n) 
			(times 
				prev 
				(divide
					(minus 1 (times 2 n))
					(times 2 (plus n 1))))))
	(setq n 1)
	(setq sum 1)
	(setq prev 1)
	(while (less n 100)
	    ((setq prev (sqrt_iter prev n))
		 (setq sum (plus sum prev))
		 (setq n (plus n 1))))
	sum))

(func max (a b)
	(cond (greater a b) a b))

(func min (a b)
	(cond (less a b) a b))

(func max_in_list (lst)
	((setq max_val (head lst))
	(while (not (isnull lst))
		((setq max_val (max max_val (head lst)))
		(setq lst (tail lst))))
	max_val))

(func pow (x i)
	((setq res 1)
	(cond (equal i 0)
		(res)
		(cond (greater i 0)
			((while (greater i 0)
				((setq i (minus i 1))
				(setq res (times res x))))
			(return res))
			((while (less i 0)
				((setq i (plus i 1))
				(setq res (divide res x))))
			(return res))))))

(func get_max (a b)
	(cond (greater a b)
		(a)
		(b)))

(func get_min (a b)
	(cond (greater a b)
		(b)
		(a)))

; a, b, c - the sides of the triangle
; print result
(prog 
    ((a 3) (b 4) (c 5)) 
    ((func is_rightangled (a b c) 
    (cond (less a 1)
		(FALSE)
		(cond (less b 1)
			(FALSE)
			(cond (less c 1)
				(FALSE)
				(equal 
					(plus (plus (sqr a) (sqr b)) (sqr c)) 
					(sqr (get_max (get_max a b) c)))))))
	(print (is_rightangled a b c))))

; should print always true
(prog 
	((bool TRUE) (int 12))
	(print (cond (isbool bool)
		(isint int)
		(FALSE))))