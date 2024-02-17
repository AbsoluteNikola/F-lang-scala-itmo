(func sqr (x)
	(times x x))

(defun sqrt-by-taylor (x &optional tolerance) ;; кто то может переписать на F?
  (if (null tolerance) (setf tolerance 0.0001))
  (labels ((sqrt-iter (guess)
             (let ((next-guess (/ (+ guess (/ x guess)) 2)))
               (if (< (abs (- next-guess guess)) tolerance)
                   next-guess
                   (sqrt-iter next-guess)))))
    (sqrt-iter 1.0)))

(func max (a b)
	(cond (greater a b)
		a
		b))

(func min (a b)
	(cond (less a b)
		a
		b))

(func max_in_list (lst)
	(
		(setq max_val (head lst)) ;; корректный синтаксис?
		(while (not (isnull lst))
			(
				(setq max_val (max max_val (head lst)))
				(setq lst (tail lst))))
		max_val))
