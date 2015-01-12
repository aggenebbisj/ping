docker rm -f aggenebbisj/ping
docker run --name ping -d -p 8080:8080 -p 9990:9990 --link mysql:mysql aggenebbisj/ping
