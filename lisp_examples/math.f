(func max (a b)
	(cond (greater a b) a b))

(func min (a b)
	(cond (less a b) a b))

(func max_in_list (lst)
    (cond (isnull (head lst))
        (null)
        (do
            (setq max_val (head lst))
            (while (not (isnull (head lst)))
                (do
                    (setq max_val (max max_val (head lst)))
                    (setq lst (tail lst))))
        max_val)))

(func pow (x i)
	(do
    (setq res 1)
    (cond (equal i 0)
      (return res)
      (cond (greater i 0)
          (do
              (while (greater i 0)
                (do
                    (setq i (minus i 1))
                    (setq res (times res x))))
              (return res))
          (do (while (less i 0)
                (do
                  (setq i (plus i 1))
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
    (do
        (func is_rightangled (a b c)
            (cond (less a 1)
                (false)
                (cond (less b 1)
                    (false)
                    (cond (less c 1)
                        (false)
                        (equal
                            (plus (plus (sqr a) (sqr b)) (sqr c))
                        (times 2 (sqr (get_max (get_max a b) c))))))))
	(print (is_rightangled a b c))))

; should print always true
(prog 
	((bool true) (int 12))
	(print (cond (isbool bool)
		(isint int)
		(false))))

; pows example
(print (pow 3.0 3))
(print (pow 3.0 -3))

(print (max_in_list (list 1 2 5.5 42 0.2 -5 3)))