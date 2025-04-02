# Projecte: Gestor de Magatzem de Fusta

**Nom i Cognoms:** Mario Marín

---

## Breu descripció del projecte

Ha estat molt beneficiosa aquesta tasca per desenvolupar-me amb les meves capacitats com a programador. He decidit fer un gestor d’un magatzem de fusta on es poden programar comandes i també gestionar l’inventari. Aquesta opció no l’he escollida per res en especial, sinó perquè m’ha semblat una bona forma d’aplicar tots els coneixements apresos a classe, i també alguns que he anat descobrint pel meu compte.

L’aplicació permet portar un control del material disponible, afegir, modificar o eliminar fusta, crear comandes per part de clients i fer un seguiment dels enviaments amb un temporitzador. Ha estat molt satisfactori treballar en aquest tipus de tasques, ja que s’assemblen més a un projecte real que altres activitats que hem fet fins ara.

---

## Nou disseny de l’aplicació

Aquesta segona iteració del projecte parteix de la base inicial, però ha estat totalment refactoritzada per complir els principis de disseny que hem treballat. El sistema està organitzat en diferents paquets amb separació clara de responsabilitats:

- **model**: conté classes com `Wood` i `Client`
- **logic**: conté `Inventory`, `OrderManager`, `PurchasingManager`
- **price**: conté l’estratègia de preus amb la interfície `PriceStrategy`
- **ui**: conté la interfície per consola (menú i accions)
- **util**: conté eines com `IdGenerate`, `TimeOrder` i `SendOrders`

També he aplicat el patró Strategy per fer el càlcul de preus configurable, i s’ha separat la lògica del sistema de la interfície de consola. A més, s’han creat dades de prova per comprovar el funcionament.

L’objectiu és tenir un sistema clar, mantenible i fàcil d’estendre.

---

## Futures millores en una tercera iteració

- Persistència amb base de dades
- Afegir la compra de material per renovar l’inventari
- Afegir més estratègies de preu (descomptes, preu per tipus de fusta)
- Implementar proves unitàries amb JUnit 5

---

## Conclusions

Ha estat molt beneficiosa aquesta tasca per desenvolupar-nos com a programadors. He fet un gestor d’un magatzem de fusta amb comandes i gestió d’inventari. He escollit aquesta opció per aplicar els coneixements apresos i també els que he après pel meu compte. És una tasca satisfactòria perquè s’assembla més a un projecte real que a altres exercicis.
