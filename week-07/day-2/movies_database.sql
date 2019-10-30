SELECT name, title FROM movie inner JOIN rating r1 ON r1.mID = movie.mID
-- For all cases where the same reviewer rated the same movie twice 
-- and gave it a higher rating the second time, return the reviewer's name and the title of the movie.
