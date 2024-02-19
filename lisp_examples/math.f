(func sqr (x)
	(times x x))
	
(func sqrt_by_taylor (x)
	((setq dec_x (minus x 1))
	(setq sqrt_iter 
		(lambda (prev n) 
			(times 
				prev 
				(devide 
					(minus 1 (times 2 n))
					(times 2 (plus n 1))))))
	(setq n 1)
	(setq sum 1)
	(setq prev 1)
	(while (less n 100)
		(setq prev (eval (sqrt_iter prev n)))
		(setq sum (plus sum prev))
		(setq n (plus n 1)))
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
