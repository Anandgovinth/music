package com.anand;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class MyMenu {
	
	SongImpl songs = new SongImpl();
	PodcastImpl podcastimpl = new PodcastImpl();
	PlaylistImpl play = new PlaylistImpl();
	UserImpl user = new UserImpl();

	ArrayList<Song> songList = new ArrayList<Song>();

	ArrayList<Podcast> podcastList = new ArrayList<Podcast>();

	ArrayList<Playlist> playlist = new ArrayList<Playlist>();
	
	ArrayList<User> userList = new ArrayList<User>();
	
	Scanner scan1 = new Scanner(System.in);
	
	public  boolean myMenu (){
		
		while (true) {
			System.out.println("Enter you choice : \n 1.Display all songs \n2.ArtistName \n3.AlbumName \n4.GenreType \n5.Podcast \n6InsertSong \n7InsertPodcast \n8 CombinationOfpodcastAnd  \n10 Exit");
			int choice1 = scan1.nextInt();

			switch (choice1) {

			case 1:
				
				songs.displayAllSongs(songList);
				break;
			case 2:
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your Artist Name :");
				String Name = scan.nextLine();
				songList = songs.ListSongsByArtist(Name);
				scan.close();
				break;
			case 3:
				System.out.println("Enter your Album Name :");
				Scanner scan2 = new Scanner(System.in);
				String AlbumName = scan2.nextLine();
				songList = songs.ListSongsByAlbumName(AlbumName);
				scan2.close();
				break;
			case 4:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter your Genre Type Name :");
				String GenreType = scan3.nextLine();
				songList = songs.ListSongsByGenreType(GenreType);
				break;

			case 5:
				podcastList = podcastimpl.PodCatalog();
				break;

			case 6:
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter playlist name:");
				String playlistName = scan4.next();
				System.out.println("enter songid:");
				int songid = scan4.nextInt();
				play.insertSong(songList, playlistName, songid);
				break;
			case 7:
				Scanner scan5 = new Scanner(System.in);
				System.out.println("enter playlistname:");
				String name1 = scan5.next();
				System.out.println("enter  podcastid");
				int podcastid = scan5.nextInt();
				play.insertPodcast(podcastList, name1, podcastid);
				break;
			case 8:
				Scanner scan6 = new Scanner(System.in);
				System.out.println("enter playlistname:");
				String name2 = scan6.next();
				System.out.println("enter songid ");
				int id = scan6.nextInt();
				System.out.println("enter  podcastid ");
				int podcastid1 = scan6.nextInt();
				play.insertCombinedList(id, podcastid1, name2, podcastList, songList);
				break;
			

			}

		}
	}

	}

