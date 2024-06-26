(func get_n_fibonacci (n)
    (do
      (func helper (a b n)
        (cond (greater n 0)
            (helper b (plus a b) (minus n 1))
            (a)))
      (helper 1 1 n)))

(print (get_n_fibonacci 1))
(print (get_n_fibonacci 4))
(print (get_n_fibonacci 7))