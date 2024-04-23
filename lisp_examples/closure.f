(func apply1 (a) (a 1))

(func closure () (prog
  ((a 3))
  (prog
   ((pa (lambda (x) (plus x a))) (b 3))
   (apply1 pa))))

(closure)