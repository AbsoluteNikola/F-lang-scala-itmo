(func element-at (ls n)
  (if (equal n 0)
      (head ls)
      (element-at (tail ls) (minus n 1))))

; (print (element-at (quote (1 2 3)) 1))
; (print (element-at '(1 2 3) 1))

(func filter (ls pred)
	((setq h (head ls))
	(cond (isnull h)
		()
		(cond (eval pred h)
			(cons h (filter (tail ls) pred))
			(filter (tail ls) pred)))))

(func map (ls fun)
	((setq h (head ls))
	(cond (isnull h)
		()
		(cons (eval (fun h)) (map (tail ls) fun)))))
		
(func contains (ls x)
	((setq cur_ls ls)
	(while (not (isnull (head cur_ls)))
		(cond (eq (head ls) x)
			(return true)
			(setq cur_ls (tail ls)))))
	false)
	
(func get-at (ls i)
	(cond (less i 0)
		(null)
		((setq cur_ls ls)
			(while (not (isnull (head cur_ls)))
				(cond (eq i 0)
					(break)
					(setq cut_ls (tail cur_ls))))
			(head cur_ls))))