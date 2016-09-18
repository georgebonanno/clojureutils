(import java.io.BufferedReader)
(import java.io.InputStreamReader)
(import java.io.InputStream)

(defn readFromReader [is] (
		do
			(println "readFromReader")
			(let [s (.readLine is)]
				(do
					(println (str s " " (nil? s)))
					(if (nil? s)
						""
						(let [other (readFromReader is)]
							(do
								(str s "\n" other)
							)
						)
					)
				)
			)
	
	)
)

(defn readFromStream [is] (
	readFromReader (new BufferedReader (new InputStreamReader is)))
)


