(require '(jvm-midi-via-clojure [stuff :as stuff]))
(import '(rwmidi RWMidi))

(let [devs (RWMidi/getInputDevices)]
  (doseq [d devs]
    (println d)))

(let [d (nth (RWMidi/getInputDevices) 0)] )

(def d (nth (RWMidi/getOutputDevices) 0))

d

(def output (.createOutput d))

output

(.sendNoteOn output 1 60 64)
(.sendNoteOff output 1 60 0)

(.sendController output 1 64 30)
