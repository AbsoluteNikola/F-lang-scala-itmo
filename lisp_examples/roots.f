; x1 = (-b + sqrt D) / 2a   
(func root_x1 (a b D) 
      (divide (plus (minus 0 b) 
                    (sqrt D))
              (times 2 a)))

; x2 = (-b - sqrt D) / 2a   
(func root_x2 (a b D) 
      (divide (minus (minus 0 b) 
                    (sqrt D))
              (times 2 a)))


(func roots (a b c)
  (prog ((D (minus (times b b) (times (times (a c) 4))))) ; D = b^2 - 4ac
    (cond (less D 0)
      nil
      (cond (equal D 0)
        (root_x1 a b D)
        (prog
          ((x1 (root_x1 a b D)) (x2 (root_x2 a b D)))))))


(print (roots 1 2 3))