(func element-at (ls n)
  (cond (equal n 0)
      (head ls)
      (element-at (tail ls) (minus n 1))))

; (print (element-at (quote (1 2 3)) 1))
; (print (element-at '(1 2 3) 1))

(func filter (ls pred)
	(do
        (setq h (head ls))
        (cond (isnull h)
            ()
            (cond (pred h)
                (cons h (filter (tail ls) pred))
                (filter (tail ls) pred)))))

(func map (ls fun)
	(do
        (setq h (head ls))
        (cond (isnull h)
            ()
            (cons (fun h) (map (tail ls) fun)))))
		
(func contains (ls x)
	(do
        (setq cur_ls ls)
        (while (not (isnull (head cur_ls)))
            (do (cond (equal (head cur_ls) x)
                (return true)
                (setq cur_ls (tail cur_ls)))))
        (return false)))

(func get-at (ls i)
	(cond (less i 0)
		(null)
		(do
            (setq cur_ls ls)
            (setq cur_i i)
			(while (not (isnull (head cur_ls)))
				(cond (equal cur_i 0)
					(break)
					(do
                        (setq cur_ls (tail cur_ls))
                        (setq cur_i (minus cur_i 1))
                    )))
			(head cur_ls))))

(func plus_x (ls x)
  (map ls (lambda (y) (plus x y))))

(print (plus_x (list 1 2 3) 4))

(func more (x)
   (greater x 1))

(print (filter (list 1 2 3) more)) ; with function more
(print (filter (list 1 2 3) (lambda (x) (greater x 1)))) ; with lambda

(print (map (list 1 2 3) (lambda (x) (times x 2))))
(print (contains (list 1 2 3) 3))

(print (get-at (list 1 2 3) 10))