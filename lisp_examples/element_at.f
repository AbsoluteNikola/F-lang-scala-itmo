(func element-at (ls n)
  (if (equal n 0)
      (head ls)
      (element-at (tail ls) (minus n 1))))

; (print (element-at (quote (1 2 3)) 1))
; (print (element-at '(1 2 3) 1))

(func filter (ls pred)
	((setq h (head ls))
	(cond (isnull h)
		return ()
		return (cond (eval pred h)
			(cons h (filter (tail ls) pred))
			(filter (tail ls) pred)))))

(func map (ls fun)
	((setq h (head ls))
	(cond (isnull h)
		return ()
		return (cons (eval (fun h)) (map (tail ls) fun)))))
		