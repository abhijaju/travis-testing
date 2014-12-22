#
# Spec File for openBuild
#

%global common_summary Cyptographic Haskell Library

Name          : webhook-testing
Version       : 1.0
Release       : 0
Summary       : %{common_summary}
License       : GPL
Group         : Applications/Libraries
URL           : https://github.com/abhijaju/travis-testing
Packager      : Abhimanyu Jaju <abhijaju@cse.iitk.ac.in>
Source0       : master.tar.gz
BuildRoot     : %{_tmppath}/%{name}-%{version}-build
BuildRequires : haskell-platform

%description
%{common_summary}

%prep
%setup –q
echo `uname -a`
ghc --version
cabal --version
ghc-pkg list

%build

%install
echo DONE

%files
