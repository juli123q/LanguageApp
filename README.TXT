------------------------------------------------------------------------
Dies ist die README-Datei des Projekts. Hier sollten Sie Ihr Projekt
beschreiben.
Erzählen Sie dem Leser (jemand, der nichts über dieses Projekt weiss),
alles, was er/sie wissen muss. Üblicherweise sollte der Kommentar 
zumindest die folgenden Angaben umfassen:
------------------------------------------------------------------------

PROJEKTBEZEICHNUNG: Vokabeltrainer
PROJEKTZWECK: MMP
VERSION oder DATUM: 28.02.21
WIE IST DAS PROJEKT ZU STARTEN:
AUTOR(EN): Julia Umbreit
BENUTZERHINWEISE:

Der Vokabeltrainer umfasst 2 Klassen, Trainer und Vokabeln.

Die Klasse Vokabeln enthält die Liste aller zu erlernenden Vokabelpaare (Fremdwort und Übersetzung).
- werden in HashMaps gelagert
- niedrigste HashMap ist täglich, d.h. sie enthält alle Vokabeln die täglich zu wiederholen sind
- nachfolgende HashMaps sind wöchentlich, monatlich, gelegentlich
- richtige Vokabeln steigen in nächsthöhere HashMap auf
- alle falsche Vokabeln verbleiben in täglich bzw. werden dorthin zurück verschoben
- alle HashMaps haben einen int Wert, der die Tage eines Monats und somit die Häufigekit der Wiederholung repräsentieren soll

In der Klasse Trainer wird das Hauptprogramm durchgeführt. 
- interne Abfrage des Tages eines Monats dient zur Auswahl der passenden Hashmap
- Bsp. 28.02.21 ist 28. Tag eines Monats int = 28 somit Auswahl der HashMap monatlich
- nach Auswahl der HashMap Erfragen der abzufragenden Art der Vokabeln (key = Chinesisch, value = Deutsch)
und Ausgabe des entsprechenden Strings
- Input muss jeweils die richtige Übersetzung sein
- Achtung bei Eingabe chinesischer Zeichen -> Chinesisch vereinfacht (kein Pinyin oder traditionell)
- bei richtigen Input wird Vokabel in nächsthöhere HashMap verschoben
- bei falschen Input wird Vokabel in HashMap täglich verschoben bzw. bleibt dort
- nachdem alle Elemente der HashMap abgefragt wurden wird Durchlauf beendet und kann neu gestartet werden

Quellen: - Vorlesungsfolien MMP
- Tag eines Monats - https://stackoverflow.com/questions/7226156/how-to-get-day-of-the-month


