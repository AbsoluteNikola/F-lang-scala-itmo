(func apply1 (f) (f 1))

(func closure ()
    (prog ((a 2))
        (prog ((pa (lambda (x) (plus x a)))
            (b 3))
            (apply1 pa))))

(closure)