; BUG: setq influences outer scope?

(do
    (do
        (setq a 10)
        (print a))
    (print a))