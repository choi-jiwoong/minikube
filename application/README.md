## 배포
```
docker build -t dockerhub/demo:latest .
docker push dockerhub/demo:latest 
```


## apply 
```
$ kubectl apply -f ./deployment.yaml
```

## delete
```
$ kubectl delete -f ./deployment.yaml
 ```
