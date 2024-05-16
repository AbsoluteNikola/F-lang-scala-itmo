(do
    (func go (x)
        (cond (equal x 10)
            (return x)
            (do
              (print x)
              (go (plus x 1)))
        ))
    (go 1))

