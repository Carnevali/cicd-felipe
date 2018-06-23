#/bin/bash
set -x

echo "Iniciando deploy"
scp -i cicd-peta.pem target/*.jar deploy@206.81.15.174:/dados/deploy/
ssh -i cicd-peta.pem deploy@206.81.15.174 '/dados/deploy/start.sh' &