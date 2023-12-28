/******************************** BD ********************************/
fetch('../comic')
    .then(res => res.json())
    .then(res => {
        var comicListNode = document.getElementById('comic-list');
        comicListNode.innerHTML = "";

        var table = document.createElement("table");
        table.setAttribute("border","1");
        comicListNode.appendChild(table);

        res.forEach(comic => {
            var tr = document.createElement("tr");
            table.appendChild(tr);

            var td = document.createElement("td");
            var text = document.createTextNode(`${comic.title}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            text = document.createTextNode(`${comic.tome}`);
            td.appendChild(text);
            tr.appendChild(td);

			td = document.createElement("td");
            text = document.createTextNode(`${comic.subtitle}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            var button = document.createElement("button");
            button.setAttribute("type","button");
            button.onclick = function() {
                showDetailComic(`${comic.id}`);
            };
            text = document.createTextNode("Details");
            button.appendChild(text);
            td.appendChild(button);
            tr.appendChild(td);


        });

    });

function showDetailComic(comicId){
    fetch("comic/"+comicId)
    .then(res => res.json())
    .then(res => {
        var comicDetailNode = document.getElementById('comic-detail');
        comicDetailNode.innerHTML = "";

        var p = document.createElement("p");
        var text = document.createTextNode(`Titre : ${res.title}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Tome : ${res.tome}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Sous-titre : ${res.subtitle}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

		p = document.createElement("p");
        text = document.createTextNode(`A partir de : ${res.ageMin} ans`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Résumé : ${res.resume}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        var image = document.createElement("img");
        image.src=res.pathImage;
        comicDetailNode.appendChild(image);

    });
}

/******************************** GAME ********************************/
fetch('../game')
    .then(res => res.json())
    .then(res => {
        var comicListNode = document.getElementById('game-list');
        comicListNode.innerHTML = "";

        var table = document.createElement("table");
        table.setAttribute("border","1");
        comicListNode.appendChild(table);

        res.forEach(game => {

            var tr = document.createElement("tr");
            table.appendChild(tr);

            var td = document.createElement("td");
            var text = document.createTextNode(`${game.name}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            text = document.createTextNode(`${game.idAuthor}`);
            td.appendChild(text);
            tr.appendChild(td);

			td = document.createElement("td");
            text = document.createTextNode(`${game.publicationYear}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            var button = document.createElement("button");
            button.setAttribute("type","button");
            button.onclick = function() {
                showDetailGame(`${game.id}`);
            };
            text = document.createTextNode("Details");
            button.appendChild(text);
            td.appendChild(button);
            tr.appendChild(td);


        });

    });


function showDetailGame(gameId){
    fetch("game/"+gameId)
    .then(res => res.json())
    .then(res => {
        var comicDetailNode = document.getElementById('game-detail');
        comicDetailNode.innerHTML = "";

        var p = document.createElement("p");
        var text = document.createTextNode(`Titre : ${res.name}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Auteur : ${res.idAuthor}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Sortie en : ${res.publicationYear}`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

		p = document.createElement("p");
        text = document.createTextNode(`A partir de ${res.ageMin} ans`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Entre ${res.numberPlayersMin} et ${res.numberPlayersMax} joueurs`);
        p.appendChild(text);
        comicDetailNode.appendChild(p);

    });
}