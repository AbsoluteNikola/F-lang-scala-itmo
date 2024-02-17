(func element-at (ls n)
  (if (equal n 0)
      (head ls)
      (element-at (tail ls) (minus n 1))))

; (print (element-at (quote (1 2 3)) 1))
; (print (element-at '(1 2 3) 1))