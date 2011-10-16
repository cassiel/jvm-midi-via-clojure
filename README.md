# jvm-midi-via-clojure

FIXME: write description

## Usage

Download RWMidi JAR package from [here][rwmidifiles].

Install into local Maven repository:

	mvn install:install-file \
		-Dfile=rwmidi.jar \
		-DgroupId=com.ruinwesen \
		-DartifactId=com-ruinwesen-rwmidi \
		-Dversion=0.1c \
		-Dpackaging=jar \
		-DgeneratePom=true

## License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.

[rwmidifiles]: http://ruinwesen.com/files
