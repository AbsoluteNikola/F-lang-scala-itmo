(func plus1 (f) (f 1))

(prog
  ((a 1))
  (prog
   ((pa (lambda (x) (plus x a))) (b 3))
   (plus1 pa)))

