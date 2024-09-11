package com.mycompany.lojas_de_discos;

import java.util.ArrayList;
import java.util.List;

public class Lojas_de_discos {

    public static void main(String[] args) { 
        //Criando Artistas
        Artista blackSabbath = new Artista("Black Sabbath", "1987 - 1994");
        Artista deepPurple = new Artista("Deep Purple", "1968 - Hoje");
        
        //Criando musicas album 1
        Musica warPigs = new Musica("War Pigs","7:55");
        Musica paranoidSong = new Musica("Paranoid","2:47");
        Musica planetCaravan = new Musica("Planet Caravan","4:29");
        Musica ironMan = new Musica("Iron Man","5:54");
        Musica electricFuneral = new Musica("Electric Funeral","4:49");
        Musica handOfDoom = new Musica("Hand Of Doom","7:07");
        Musica ratSalad = new Musica("Rat Salad","2:29");
        Musica fairesWear = new Musica("Smell Like Teens Spirit","5:01");
        
        //Criando musicas album 2
        Musica holeSky = new Musica("Hole in the Sky","3:59");
        Musica dontStart = new Musica("Don't Start (Too Late)","0:49");
        Musica symptomUni = new Musica("Symptom of the Universe","6:29");
        Musica megalomania = new Musica("Megalomania","9:41");
        Musica thrillAll = new Musica("Thrill of It All","5:55");
        Musica supertzar = new Musica("Supertzar","3:43");
        Musica amIGoing = new Musica("Am I Going Insane (Radio)","4:23");        
        
        //Criando musicas album 3
        Musica highwayStar = new Musica("Highway Star","6:05");
        Musica maybeLeo = new Musica("Maybe I'm a Leo","4:51");
        Musica picturesHome = new Musica("Pictures of Home","5:03");
        Musica neverBefore = new Musica("Never Before","3:56");
        Musica smokeWater = new Musica("Smoke on the Water","5:40");
        Musica lazy = new Musica("Lazy","7:19");
        Musica spaceTruckin = new Musica("Space Truckin","4:31");
        
        //Criando listas de musicas
        List <Musica> musicasParanoid = new ArrayList <Musica>();
        List <Musica> musicasSabotage = new ArrayList <Musica>();
        List <Musica> musicasMachineHead = new ArrayList <Musica>();
        
        //Inserindo musicas nas listas
        musicasParanoid.add(warPigs);
        musicasParanoid.add(paranoidSong);
        musicasParanoid.add(planetCaravan);
        musicasParanoid.add(ironMan);
        musicasParanoid.add(electricFuneral);
        musicasParanoid.add(handOfDoom);
        musicasParanoid.add(ratSalad);
        musicasParanoid.add(fairesWear);
        musicasSabotage.add(holeSky);
        musicasSabotage.add(dontStart);
        musicasSabotage.add(symptomUni);
        musicasSabotage.add(megalomania);
        musicasSabotage.add(thrillAll);
        musicasSabotage.add(supertzar);
        musicasSabotage.add(amIGoing);
        musicasMachineHead.add(highwayStar);
        musicasMachineHead.add(maybeLeo);
        musicasMachineHead.add(picturesHome);
        musicasMachineHead.add(neverBefore);
        musicasMachineHead.add(lazy);
        musicasMachineHead.add(handOfDoom);
        musicasMachineHead.add(spaceTruckin);
          
        //Criando albums com objetos Artista e Musica
        Album paranoid = new Album("Paranoid", 1969,  blackSabbath, musicasParanoid);
        Album sabotage = new Album("Sabotage", 1975, blackSabbath, musicasSabotage);
        Album machineHead = new Album("Nevermind", 1991, deepPurple, musicasMachineHead);
        
        //printando os albums
        System.out.println(paranoid);
        System.out.println(sabotage);
        System.out.println(machineHead);
        
        //Atualizando dados
        fairesWear.setFaixa("Faires Wear Boots");
        fairesWear.setFaixaDuracao("6:13");
        blackSabbath.setAnosDeAtividade("1968 - 2011");
        machineHead.setNomeAlbum("MachineHead");
        machineHead.setAnoLancamento(1974);
        Musica writ = new Musica("The Writ","8:44");
        musicasSabotage.add(writ);
        
        //printando após atualizações
        System.out.println("**************** ATUALIZADO *******************");
        System.out.println(paranoid);
        System.out.println(sabotage);
        System.out.println(machineHead);
    }
}
